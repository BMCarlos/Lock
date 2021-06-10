package prgm2;

public class NoteDataStructureClass {
	
	private String strValue, length, keyColor;
    private int value;
    private double frequency;
    private String white = "White key";
    private String black = "Black key";
    private String[] values = {"C", "C#", "D", "D#", "E", "F",
            "F#", "G", "G#", "A", "A#", "B"};

    // Initialize to C
    public NoteDataStructureClass()
    {
        this.value = -9;
        this.length = "Quarter";
        this.keyColor = white;
        setStrValue(value);
        setValue(value);

    }
    //Overloaded constructor
    public NoteDataStructureClass(int value, String length)
    {
        this.value = value;
        this.length = length;
        setStrValue(value);
        setValue(value);
    }
     //Copy constructor
    public NoteDataStructureClass(NoteDataStructureClass Note)
    {
        this.strValue = Note.strValue;
        this.length = Note.length;
        this.value = Note.value;
        this.keyColor = Note.keyColor;
        this.frequency = Note.frequency;
    }
    public void setValue(int val)
    {
        setStrValue(val);
        setKeyColor(val);
        setFrequency(val);
    }
    public void setStrValue(int val)
    {
        switch (val) {
            case -9: this.strValue = values[0];
                break;
            case -8: this.strValue = values[1];
                break;
            case -7: this.strValue = values[2];
                break;
            case -6: this.strValue = values[3];
                break;
            case -5: this.strValue = values[4];
                break;
            case -4: this.strValue = values[5];
                break;
            case -3: this.strValue = values[6];
                break;
            case -2: this.strValue = values[7];
                break;
            case -1: this.strValue = values[8];
                break;
            case 0: this.strValue = values[9];
                break;
            case 1: this.strValue = values[10];;
                break;
            case 2: this.strValue = values[11];
                break;
            default:
                System.out.println("Value is not valid.");
        }

    }
   
   

    public String getKeyColor()
    {
        return keyColor;
    }

    public double getFrequency()
    {
        return frequency;
    }

    public void setLength(String length)
    {
        setStrLength(length);
    }
    public int getValue()
    {
        return value;
    }

    public String getLength()
    {
        return length;
    }

    @Override
    public String toString() {
        return String.format(strValue + "\n" + "Length: " + length + " note\n" + "Value: " +
                 value + "\n" + keyColor + "\n" + "%.1fHz", frequency);
    }


public void setStrLength(String str)
{
    this.length = str;
}

public void setKeyColor(int val)
{
    if (val == -9 || val == -7 || val == -5 || val == -4 ||
            val == -2 || val == 0 || val == 2)
    {
        this.keyColor = white;
    }else
        this.keyColor = black;
}
public void setFrequency(double val) {
    double exp = val/12;
    this.frequency = (440 * Math.pow(2, exp));

}
}
