package util;

import static javax.sound.sampled.AudioFormat.Encoding.PCM_SIGNED;
import static javax.sound.sampled.AudioSystem.getAudioInputStream;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AudioFilePlayer {

	SourceDataLine line = null;
	String file;
	Thread bkgmusic;

	public AudioFilePlayer(String file) {
		this.file = file;
	}

	public static AudioFilePlayer getFilePlayer(String file) {
		return new AudioFilePlayer(file);
	}
	
	public void startPlaying() {
		bkgmusic = new Thread(){
	          public void run() {
	        	  play();
	          };
		};
		bkgmusic.start();
	}
	
	private void play() {
            /*
		URL urlfile = getClass().getResource(file);
		final File file = new File(urlfile.getFile()).getAbsoluteFile();
		try (final AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file)) {

			try (final AudioInputStream in = getAudioInputStream(file)) {

				final AudioFormat outFormat = getOutFormat(in.getFormat());
				final Info info = new Info(SourceDataLine.class, outFormat);
				line = (SourceDataLine) AudioSystem.getLine(info);
				if (line != null) {

					try {
						line.open(outFormat);
						line.start();
						stream(getAudioInputStream(outFormat, in), line);
					
						line.drain();
						line.stop();
					} catch (LineUnavailableException | IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			} catch (LineUnavailableException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (UnsupportedAudioFileException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public void stop() {
		bkgmusic.interrupt();
		line.close();
	}
	
	public boolean isPlaying() {
		return line.isActive();
	}

	private AudioFormat getOutFormat(AudioFormat inFormat) {
		final int ch = inFormat.getChannels();
		final float rate = inFormat.getSampleRate();
		return new AudioFormat(PCM_SIGNED, rate, 16, ch, ch * 2, rate, false);
	}

	private void stream(AudioInputStream in, SourceDataLine line) throws IOException {
		final byte[] buffer = new byte[65536];
		for (int n = 0; n != -1; n = in.read(buffer, 0, buffer.length)) {
			line.write(buffer, 0, n);
		}
*/
	}
}