package CandidateManager;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class JDateLabelFormat extends JFormattedTextField.AbstractFormatter {
    private String datePattern = "yyyy-MM-dd";
    SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
    @Override
    public Object stringToValue(String text) throws ParseException {
        return sdf.parseObject(text);
    }

    @Override
    public String valueToString(Object value) throws ParseException {
        if(value != null) {
            Calendar c = (Calendar) value;
            return sdf.format(c.getTime());
        }
        return "2002-02-26";
    }
}
