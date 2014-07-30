package com.mattfx.mcmodtut.utility;


import com.mattfx.mcmodtut.reference.Reference;
import cpw.mods.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

public class LogHelper {
    public static void log(Level logLevel, Object object) //object can be anything, outputted as log entry (string or java object e.g. item -> gets string value of it)
    {
        FMLLog.log(Reference.MOD_NAME, logLevel, String.valueOf(object)); //puts log entry in FML logger, identified with this mod
    }

    public static void all(Object object)
    {
        log(Level.ALL, object);
    }

    public static void debug(Object object)
    {
        log(Level.DEBUG, object);
    }

    public static void error(Object object)
    {
        log(Level.ERROR, object);
    }

    public static void fatal(Object object)
    {
        log(Level.FATAL, object);
    }

    public static void info(Object object)
    {
        log(Level.INFO, object);
    }

    public static void off(Object object)
    {
        log(Level.OFF, object);
    }

    public static void trace(Object object)
    {
        log(Level.TRACE, object);
    }

    public static void warn(Object object)
    {
        log(Level.WARN, object);
    }
}
