package io.andrewgarner.kdroid.time;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by andrewgarner on 8/7/18.
 */
public class TimeActivityJava extends AppCompatActivity {

    /**
     * Returns intent for {@link TimeActivityJava}.
     */
    @NonNull
    public static Intent createIntent(@NonNull final Context context) {
        Intent intent = new Intent(context, TimeActivityJava.class);
        return intent;
    }


    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = TimeActivityKt.TimeActivityIntent(this, "Hello");
        Intent intent2 = TimeActivity.Companion.newIntent(this, "Hello");
    }
}
