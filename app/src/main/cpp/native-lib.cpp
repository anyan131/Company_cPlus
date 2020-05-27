#include <jni.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <fcntl.h>
#include <unistd.h>
#include <sys/ioctl.h>
#include <android/log.h>
#include <termios.h>
#include <string>

extern "C" JNIEXPORT void JNICALL
Java_com_example_mycpuls_MyGps_stringFromJNI(
        JNIEnv* env,
        jobject /* this */, jint Angle, jint flag) {
    std::string hello = "Hello from C++";
    int fd;
    fd = open("/dev/myGPIO", O_RDWR | O_NOCTTY | O_NONBLOCK);
    if(fd < 0)
        printf("Can't open /dev/leds!\n");
    ioctl(fd,Angle,flag);
    close(fd);
}
