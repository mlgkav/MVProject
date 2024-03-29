public class TestCase {
    private String text;
    private int[] semanticVals;

    public TestCase(String text, int[] semanticVals) {
        this.text = text;
        this.semanticVals = semanticVals;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int[] getSemanticVals() {
        return semanticVals;
    }

    public int getSemanticVal(String type) {
        if (type.equals("hate")) return semanticVals[0];
        if (type.equals("mock")) return semanticVals[1];
        if (type.equals("threat")) return semanticVals[2];
        if (type.equals("discrim")) return semanticVals[3];
        if (type.equals("overall")) return semanticVals[4];

        return 0;
    }

    public void setSemanticVals(int[] semanticVals) {
        this.semanticVals = semanticVals;
    }
}
