package id.muhammadfaisal.latihanmvvm.model;

/**
 * Kelas ​Model (User) mewakili data dan bisnis logic aplikasi, ada dua variabel di dalam kelas
 * User yaitu email dan password, dua variabel ini yg nanti akan kita olah di
 * dalam kelas ​ViewModel.
 */
public class User {
    public String email;
    public String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
