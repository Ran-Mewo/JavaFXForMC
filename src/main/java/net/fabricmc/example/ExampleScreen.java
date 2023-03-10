package net.fabricmc.example;

import net.fabricmc.example.utils.EmbeddedFrameUtil;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.Window;
import org.lwjgl.glfw.GLFW;

import javax.swing.*;
import java.awt.*;

public class ExampleScreen extends JComponent {
    public static void initialize() {
        Window window = MinecraftClient.getInstance().getWindow();
        Frame frame = EmbeddedFrameUtil.embeddedFrameCreate(window.getHandle());
        frame.add(new ExampleScreen());
        EmbeddedFrameUtil.placeAtCenter(frame, window.getWidth(), window.getHeight(), 100, 100, 1);
    }

    public ExampleScreen() {
        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 0.5;
        constraints.gridx = 0;
        constraints.gridy = 0;
        add(new JLabel("Hello World!"), constraints);
    }
}
