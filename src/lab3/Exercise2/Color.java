package lab3.Exercise2;

public enum Color {
    RED("love color","#123"),
    CORAL("coral", "#ff7"),
    MAROON("coral", "#e99");

    private final String DESC;
    private final String HEXRGB;

    private Color(String d, String c){
        DESC = d;
        HEXRGB = c;
    }

    public String printValue(){
        return HEXRGB;
    }

    public static boolean contains(String strColor){
        for(Color c : Color.values()){
            if(c.name().equals(strColor))
                return true;
        }
        return false;
    }
}
