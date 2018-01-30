package com.example.sophie.saveconfigure

import android.content.Context
import mu.KLogging
import mu.KotlinLogging
import java.io.IOException

/**
 * Created by Sophie on 1/30/2018.
 */

class LogToFile(context: Context) {

    companion object: KLogging()

    fun write(logString: String) {

        try {
            logger.warn { "Hello World" }
            logger.error("Hello World")
            logger.debug("Hello World")
            logger.info("Hello World")
            logger.info(logString)

        } catch (e: SecurityException) {
            e.printStackTrace()
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}