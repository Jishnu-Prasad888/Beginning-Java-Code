#include <jni.h>
#include "SquareDemo.h"

// Implement the native method
JNIEXPORT jint JNICALL Java_SquareDemo_square(JNIEnv *env, jobject obj, jint number) {
    return number * number; // Return the square of the number
}
