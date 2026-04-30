package gr.aueb.dt.ch5;

public class GenericSpeakingSchool {
    private final ISpeakable speakable;

    // IoC - DI
    public GenericSpeakingSchool(ISpeakable speakable) {
        this.speakable = speakable;
    }

    public void speak() {
        speakable.speak();
    }
}
