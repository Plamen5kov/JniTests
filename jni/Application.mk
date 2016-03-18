APP_STL := stlport_static

NDK_TOOLCHAIN_VERSION := 4.8
APP_OPTIM := debug

#The new ndks require this or build fails
APP_CFLAGS += -Wno-error=format-security
APP_CFLAGS += -g

#Turn on C++ exceptions
APP_CPPFLAGS += -fexceptions