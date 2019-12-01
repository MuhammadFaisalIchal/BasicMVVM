package id.muhammadfaisal.latihanmvvm.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import id.muhammadfaisal.latihanmvvm.R;
import id.muhammadfaisal.latihanmvvm.viewmodel.UserViewModel;

/**
 * Kelas ini berperan sebagai kelas View
 * yang berfungsi untuk berinteraksi secara langsung dengan user.
 */
public class MainActivity extends AppCompatActivity {


    private EditText inputEmail, inputPassword;
    private Button btnLogin;
    // Deklarasi variabel untuk mengakses UserViewModel
    private UserViewModel userViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisiasi variable view
        inputEmail = findViewById(R.id.eEmail);
        inputPassword = findViewById(R.id.ePassword);
        btnLogin = findViewById(R.id.btnLogin);

        /*
         * Di dalam fungsi onClick ​button kita menjalankan perintah fungsi update model
         * yang berada di kelas UserViewModel, kemudian kelas UserViewModel akan melanjutkan
         * untuk memberi perintah ke kelas Model yaitu kelas User untuk melakukan perubahan
         * pada nilai yang ada di Kelas User sesuai instruksi dari kelas UserViewModel,
         * setelah dilakukan perubahan nilai di kelas User baru kelas UserViewModel akan          menjalankan method validLogin
         * untuk melakukan pengecekan apakah poses login success atau gagal,
         * jika proses login success maka aplikasi akan menampilkan toast dengan pesan “Login Success”
         * tapi sebaliknya jika proses login gagal maka akan menampilkan pesan “Login Failed” */
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userViewModel.updateModel(
                        inputEmail.getText().toString(),
                        inputPassword.getText().toString());

                userViewModel.validLogin();
            }
        });
    }
}
