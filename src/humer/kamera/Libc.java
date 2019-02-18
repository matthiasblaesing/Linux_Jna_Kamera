package humer.kamera;

import com.sun.jna.LastErrorException;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;

public interface Libc extends Library {

    public static final Libc INSTANCE = Native.load("c", Libc.class);

    public static final int O_RDONLY = 00;
    public static final int O_WRONLY = 01;
    public static final int O_RDWR = 02;

    int open(String path, int flags) throws LastErrorException;

    int close(int fd) throws LastErrorException;

    int ioctl(int fileHandle, int request, PointerByReference p) throws LastErrorException;

    int ioctl(int fileHandle, int request, Pointer p) throws LastErrorException;

    int ioctl(int fileHandle, int request, long l) throws LastErrorException;

    int ioctl(int fileHandle, int request, IntByReference l) throws LastErrorException;

    int ioctl(int fileHandle, int request, Structure s) throws LastErrorException;
}
