package edu.uga.cs.roommateshoppingproject;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;


import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends DialogFragment {
    private EditText emailView;
    private EditText passwordView;

    public static final String DEBUG_TAG = "LoginActivity";
    private FirebaseAuth mAuth;

        public interface LogInDialogListener {
            void logIn(String email, String password);
        }

        @NonNull
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            // Create the AlertDialog view
            LayoutInflater inflater = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            final View layout;
            //= inflater.inflate(R.layout.activity_login, getActivity().findViewById(R.id.root));

            // get the view objects in the AlertDialog
            emailView = layout.findViewById( R.id.editTextText );
            passwordView = layout.findViewById( R.id.editTextTextPassword );

            // create a new AlertDialog
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            /**
             * Original line: AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), R.style.AlertDialogStyle);
             */
            // Set its view (inflated above).
            builder.setView(layout);

            // Set the title of the AlertDialog
            builder.setTitle("Log In:");
            // Provide the negative button listener
            builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int whichButton) {
                    // close the dialog
                    dialog.dismiss();
                }
            });
            // Provide the positive button listener
            builder.setPositiveButton(android.R.string.ok, new SignInListener());

            // Create the AlertDialog and show it
            return builder.create();

        } //onCreateDialog

        private class SignInListener implements DialogInterface.OnClickListener {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // get the new job lead data from the user
                String email = emailView.getText().toString();
                String password = passwordView.getText().toString();

                // get the Activity's listener to add the new job lead
                LoginActivity.LogInDialogListener listener = (LoginActivity.LogInDialogListener) getActivity();

                // add the new job lead
                listener.logIn(email, password);

                // close the dialog
                dismiss();
            }
        }//SignInListener

    } //Login class