package id.muhammadfaisal.latihanmvvm.viewmodel;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

import id.muhammadfaisal.latihanmvvm.model.User;

/**
 * Kelas ini berperan sebagai kelas ViewModel.
 * Kelas ViewModel ini nanti nya berinteraksi dengan kelas Model
 * kemudian akan diteruskan ke dalam kelas View Activity / Fragment)​.
 */
public class UserViewModel {

    // Variable konstan global untuk pesan gagal/ sukses.
    public final static String TOAST_MESSAGE_SUCCESS = "Login Success";
    public final static String TOAST_MESSAGE_FAILED = "Login Failed";

    // Variable ini diperlukan untuk menampilkan Toast.
    private Context context;
    // Variable untuk mengambil data model dari class User.
    private User user;

    /**
     * Constructor
     */
    public UserViewModel(Context context, User user) {
        this.context = context;
        this.user = user;
    }

    /**
     * Untuk update variable global yang ada di Model User
     */
    public void updateModel(String email, String password) {
        user.setEmail(email);
        user.setPassword(password);
    }

    /**
     * Method ini berfungsi untuk mengecek apakah Edittext sudah diisi
     * oleh user apa belum
     */
    public void validLogin() {
        boolean isValid = true;

        if (TextUtils.isEmpty(user.getEmail()))
            isValid = false;

        if (TextUtils.isEmpty(user.getPassword()))
            isValid = false;

        if (isValid) {
            showToast(TOAST_MESSAGE_SUCCESS);
        } else {
            showToast(TOAST_MESSAGE_FAILED);
        }
    }

    private void showToast(String messageToast) {
        Toast.makeText(context, messageToast, Toast.LENGTH_SHORT).show();
    }
}