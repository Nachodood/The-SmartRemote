package nich.project.thesmartremote;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class LocationSelectDialogue extends AppCompatDialogFragment {

    private String m_sensor;

    public LocationSelectDialogue(String sensor) {


    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle("Sensor requirements")
                .setMessage(m_sensor + " required, functionality will be limited")
                .setPositiveButton("I understand", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //TODO:Reduce functionality here.
                    }
                });

        return builder.create();

    }
}
