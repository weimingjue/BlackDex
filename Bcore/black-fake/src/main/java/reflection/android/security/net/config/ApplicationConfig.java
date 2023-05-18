package reflection.android.security.net.config;

import reflection.MirrorReflection;

public class ApplicationConfig {
    private static final MirrorReflection REF = MirrorReflection.on("android.security.net.config.ApplicationConfig");

    public static MirrorReflection.MethodWrapper<Void> setDefaultInstance = REF.method("setDefaultInstance", REF.getClazz());

    public static MirrorReflection.MethodWrapper<Object> getDefaultInstance = REF.method("getDefaultInstance");
}
