package com.nitish.selenium.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

public class ResourceLoader {

    private static final Logger log = LoggerFactory.getLogger(ResourceLoader.class);

    public static InputStream getResource(String path) throws IOException {
        InputStream inputStream = ResourceLoader.class.getClassLoader().getResourceAsStream(path);
        if (Objects.nonNull(inputStream)) {
            log.info("Resource found in classpath: {}", path);
            return inputStream;
        }

        return Files.newInputStream(Path.of(path));
    }

}
