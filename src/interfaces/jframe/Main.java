package interfaces.jframe;

public class Main {
    public static void main(String[] args) {
        FlowLayouts flowl = new FlowLayouts("Título");
        flowl.setVisible(true);

        BorderLayouts borderl = new BorderLayouts("Título");
        borderl.setVisible(true);

        GridLayouts gridl = new GridLayouts("Título");
        gridl.setVisible(true);

        OutrasConfig outrasl = new OutrasConfig("Título");
        outrasl.setVisible(true);
    }
}
