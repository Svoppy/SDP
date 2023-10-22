
class LightningToMiniJackAdapter {
    private MiniJackHeadphones miniJackHeadphones;

    public LightningToMiniJackAdapter(MiniJackHeadphones miniJackHeadphones) {
        this.miniJackHeadphones = miniJackHeadphones;
    }

    public void playAudio() {
        miniJackHeadphones.playAudio();
    }
}


class iPhone {
    public void playAudio(LightningToMiniJackAdapter adapter) {
        adapter.playAudio();
    }
}


class MiniJackHeadphones {
    public void playAudio() {
        System.out.println("Playing audio through mini-jack headphones");
    }
}

public class Main {
    public static void main(String[] args) {

        MiniJackHeadphones miniJackHeadphones = new MiniJackHeadphones();
        LightningToMiniJackAdapter adapter = new LightningToMiniJackAdapter(miniJackHeadphones);
        iPhone iphone = new iPhone();


        iphone.playAudio(adapter);
    }
}
