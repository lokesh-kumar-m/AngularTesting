package Structural.adapter;

interface Language {
    String say(String message);
}

class EnglishSpeaker implements Language {
    @Override
    public String say(String message) {
        return "Saying in English: " + message;
    }
}

class SpanishSpeaker implements Language {
    @Override
    public String say(String message) {
        return "Diciendo en Español: " + message;
    }
}

class Translator {
    private Language englishSpeaker;
    private Language spanishSpeaker;

    public Translator(Language englishSpeaker, Language spanishSpeaker) {
        this.englishSpeaker = englishSpeaker;
        this.spanishSpeaker = spanishSpeaker;
    }

    public void communicate(String message, String language) {
        if (language.equalsIgnoreCase("english")) {
            System.out.println(englishSpeaker.say(message));
        } else if (language.equalsIgnoreCase("spanish")) {
            System.out.println(spanishSpeaker.say(message));
        } else {
            System.out.println("Language not supported.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Language englishSpeaker = new EnglishSpeaker();
        Language spanishSpeaker = new SpanishSpeaker();

        Translator translator = new Translator(englishSpeaker, spanishSpeaker);

        translator.communicate("Hello, how are you?", "english");
        translator.communicate("Hola, ¿cómo estás?", "spanish");
    }
}
