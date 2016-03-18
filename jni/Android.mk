LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)
LOCAL_CPPFLAGS += -std=c++11
LOCAL_MODULE    := JniTest
LOCAL_SRC_FILES := com_gradle_test_JniTest.cpp 
include $(BUILD_SHARED_LIBRARY)