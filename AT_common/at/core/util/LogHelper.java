package at.core.util;

import java.util.logging.Level;
import java.util.logging.Logger;

import cpw.mods.fml.common.FMLLog;

import at.lib.Reference;

public class LogHelper {

    private static Logger atLogger = Logger.getLogger(Reference.MOD_ID);

    public static void init() {

        atLogger.setParent(FMLLog.getLogger());
    }

    public static void log(Level logLevel, String message) {

        atLogger.log(logLevel, message);
    }

}