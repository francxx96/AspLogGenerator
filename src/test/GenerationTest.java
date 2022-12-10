package test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;

import org.deckfour.xes.model.XLog;

import generator.AspGenerator;

public class GenerationTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		Path declModelPath = Paths.get(System.getProperty("user.dir"), "resources", "test_model.decl");
		int minTraceSize = 2;
		int maxTraceSize = 2;
		int logSize = 5;
		
		XLog log = AspGenerator.generateLog(
				declModelPath,
				minTraceSize,
				maxTraceSize,
				logSize, 
				LocalDateTime.now(), 
				Duration.ofHours(4)
		);
	}
}
