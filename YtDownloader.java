import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class YouTubeDownloader {
    public static void downloadVideo(String url) {
        // Command to execute yt-dlp
        String command = "yt-dlp -f bestvideo+bestaudio --merge-output-format mp4 " + url;

        try {
            // Start the process
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;

            // Read the output from the command
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Wait for the process to complete
            process.waitFor();
            System.out.println("Download completed!");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide a YouTube video URL.");
            return;
        }

        String videoUrl = args[0];
        downloadVideo(videoUrl);
    }
}
