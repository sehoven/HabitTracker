// this code does not have a license
// Found here: https://github.com/Aapps/DatePicker
// https://neurobin.org/docs/android/android-date-picker-example/
// I made changes to this code

package ca.ualberta.cs.shoven_habittracker;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

/**
 * Created by shoven on 2016-09-17.
 */
public class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the current date as the default date in the picker
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        // Create a new instance of DatePickerDialog and return it
        return new DatePickerDialog(getActivity(), this, year, month, day);
    }

    public void onDateSet(DatePicker view, int year, int month, int day) {
        // Do something with the date chosen by the user
        TextView tv1= (TextView) getActivity().findViewById(R.id.dateTextView);
        String monthStr = "0"+(view.getMonth()+1);
        String dayStr = "0"+view.getDayOfMonth();
        tv1.setText(view.getYear() + "-" + monthStr.substring(monthStr.length() - 2) + "-" + dayStr.substring(dayStr.length() - 2));
    }
}
