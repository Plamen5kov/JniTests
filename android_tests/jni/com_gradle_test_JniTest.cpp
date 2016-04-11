#include <jni.h>
#include <iostream>
#include <JavaScriptCore/JSContextRef.h>
#include <JavaScriptCore/JSStringRef.h>
#include <android/log.h>
/* Header for class com_gradle_test_JniTest */


#ifndef _Included_com_gradle_test_JniTest
#define _Included_com_gradle_test_JniTest
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     com_gradle_test_JniTest
 * Method:    start 
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_com_gradle_test_JniTest_start(JNIEnv *env, jobject obj) {

	JSGlobalContextRef m_context;

	auto jsContext = JSGlobalContextCreateInGroup(nullptr, nullptr);
	if(jsContext != nullptr) {
		__android_log_write(ANDROID_LOG_INFO, "tag here", "C++: jsContext IS NOT NULL!");
	}
	else {
		__android_log_write(ANDROID_LOG_INFO, "tag here", "C++: I THOUGHT WRONG!");
	}

	__android_log_write(ANDROID_LOG_INFO, "tag here", "C++: FROM NEWLY COMPILED C++ CODE!!!");

	auto jsScript = JSStringCreateWithUTF8CString("var num = 13; var triple = function(value) { return value * 3 }");
	auto scriptEvalResult = JSEvaluateScript(jsContext, jsScript, NULL, NULL, 1, NULL);
	auto resScript = JSStringCreateWithUTF8CString("triple(num)");
	auto rez = JSEvaluateScript(jsContext, resScript, NULL, NULL, 1, NULL);

	auto rezAsNum = JSValueToNumber(jsContext, rez, NULL);

	if(rez != nullptr) {
		__android_log_print(ANDROID_LOG_INFO, "tag here", "C++: Something happened! %f", rezAsNum);
	}
	return;
}

#ifdef __cplusplus
}
#endif
#endif
