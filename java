import java.io.IOException;

public class MinecraftLauncher {

    public static void main(String[] args) {
        // Caminho para o executável do Minecraft (ajuste conforme necessário)
        String minecraftExecutablePath = "C:\\path\\to\\minecraft.exe";

        // Configurar o ProcessBuilder para iniciar o Minecraft
        ProcessBuilder processBuilder = new ProcessBuilder(minecraftExecutablePath);

        try {
            // Iniciar o Minecraft
            Process process = processBuilder.start();
            System.out.println("Minecraft iniciado com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Falha ao iniciar o Minecraft.");
        }
    }
}
