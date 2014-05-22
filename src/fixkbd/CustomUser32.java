package fixkbd;

import com.sun.jna.Native;
import com.sun.jna.win32.StdCallLibrary;

public interface CustomUser32 extends StdCallLibrary {

    CustomUser32 INSTANCE = (CustomUser32) Native.loadLibrary("user32", CustomUser32.class);

    static char[] ENGLISH_LAYOUT = "00000409".toCharArray();

    int KLF_ACTIVATE = 0x00000001;
    int KLF_SETFORPROCESS = 0x00000100;

    void LoadKeyboardLayoutW(char[] pwszKLID, int Flags);

}
