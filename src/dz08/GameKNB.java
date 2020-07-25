package dz08;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GameKNB extends JFrame
{
    String[] pieces = {"Камень", "Ножницы", "Бумага"};
    Random random = new Random();
    JButton btnR = new JButton(pieces[0]);
    JButton btnS = new JButton(pieces[1]);
    JButton btnP = new JButton(pieces[2]);
    JLabel lbl = new JLabel("  жми на кнопку");

    GameKNB()
    {
        setTitle("GameKNB");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(300, 300);
        setResizable(false);
        JPanel p1 = new JPanel(new GridLayout(1, 3));
        p1.setSize(300, 100);
        JPanel p2 = new JPanel();
        p2.setSize(300, 200);
        p2.setBackground(new Color(120, 120, 120));
        p1.add(btnR);
        p1.add(btnS);
        p1.add(btnP);
        lbl.setForeground(new Color(255, 255, 255));
        add(p1);

        JPanel bp = new JPanel();
        bp.setLayout(new GridLayout());
        bp.setBackground(new Color(120, 120, 120));
        bp.add(lbl, CENTER_ALIGNMENT);
        setLayout(new BorderLayout());
        add(bp, BorderLayout.CENTER);

        btnR.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String cpu = pieces[random.nextInt(3)];
                String player = pieces[0];
                checkWin(player, cpu);
                btnP.repaint();
                btnR.repaint();
                btnS.repaint();
            }
        });

        btnS.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String cpu = pieces[random.nextInt(3)];
                String player = pieces[1];
                checkWin(player, cpu);
                btnP.repaint();
                btnR.repaint();
                btnS.repaint();
            }
        });

        btnP.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String cpu = pieces[random.nextInt(3)];
                String player = pieces[2];
                checkWin(player, cpu);
                btnP.repaint();
                btnR.repaint();
                btnS.repaint();
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    void checkWin(String player, String cpu)
    {
        if (player.equals(cpu))
        {
            lbl.setText(player + " на " + cpu + ". Ничья!");

        }

        if (player.equals(pieces[0]))
        {
            if (cpu.equals(pieces[1]))
            {
                lbl.setText(player + " на " + cpu + ". Ты победил!");

            }
            if (cpu.equals(pieces[2]))
            {
                lbl.setText(player + " на " + cpu + ". Ты проиграл!");

            }
        }

        if (player.equals(pieces[1]))
        {
            if (cpu.equals(pieces[0]))
            {
                lbl.setText(player + " на " + cpu + ". Ты проиграл!");

            }
            if (cpu.equals(pieces[2]))
            {
                lbl.setText(player + " на " + cpu + ". Ты выиграл!");

            }
        }

        if (player.equals(pieces[2]))
        {
            if (cpu.equals(pieces[0]))
            {
                lbl.setText(player + " на " + cpu + ". Ты выиграл!");

            }
            if (cpu.equals(pieces[1]))
            {
                lbl.setText(player + " на " + cpu + ". Ты проиграл!");

            }
        }
    }
}

