LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)
LOCAL_MODULE:= jsc
LOCAL_SRC_FILES := jni/$(TARGET_ARCH_ABI)/libjsc.so
LOCAL_EXPORT_C_INCLUDES := $(LOCAL_PATH)
include $(PREBUILT_SHARED_LIBRARY)

include $(CLEAR_VARS)
LOCAL_CPPFLAGS += -std=c++11
LOCAL_MODULE    := jsc_ns
LOCAL_SRC_FILES := com_gradle_test_JniTest.cpp
LOCAL_SHARED_LIBRARIES := jsc
LOCAL_C_INCLUDES := $(LOCAL_PATH)
LOCAL_LDLIBS    := -llog -landroid -lz
include $(BUILD_SHARED_LIBRARY)
