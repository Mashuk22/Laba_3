package mis.fit.bstu.laba_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.TextView;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void FillFields(File file){

        TextView Absolute = (TextView) findViewById(R.id.Absolute);
        TextView Name = (TextView) findViewById(R.id.Name);
        TextView Path = (TextView) findViewById(R.id.Path);
        TextView CanRead_Write = (TextView) findViewById(R.id.Read_Write);
        TextView External = (TextView) findViewById(R.id.External);

        Absolute.setText(String.format("Absolute: %s", file.getAbsolutePath()));
        Name.setText(String.format("Name: %s", file.getName()));
        Path.setText(String.format("Path: %s", file.getPath()));
        CanRead_Write.setText(String.format("Read/Write: %s/%s", file.canRead(),file.canWrite()));
        External.setText(String.format("External: %s", Environment.getExternalStorageState()));
    }

    public void GetFilesDir_OnClick(View view) {
        File file = getFilesDir();
        FillFields(file);
    }

    public void GetCacheDir_OnClick(View view) {
        File file = getCacheDir();
        FillFields(file);
    }

    public void GetExternalFilesDir_OnClick(View view) {
        File file = getExternalFilesDir("Hi");
        FillFields(file);
    }

    public void GetExternalCachDir_OnClick(View view) {
        File file = getExternalCacheDir();
        FillFields(file);
    }

    public void GetExternalStorageDir_OnClick(View view) {
        File file = Environment.getExternalStorageDirectory();
        FillFields(file);
    }

    public void GGetExternalStoragePublicDir_OnClick(View view) {
        File file = Environment.getExternalStoragePublicDirectory("Hi");
        FillFields(file);
    }
}