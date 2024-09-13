/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculator;

import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author 23011
 */
public class ScreenCalculator extends javax.swing.JFrame {
    
    double firstNumber;
    double secondNumber;
    double result;
    String operation;
    double memoryReturn;

    /**
     * Creates new form ScreemCalculator
     */
    public ScreenCalculator() {
        initComponents();
     List<JButton> buttons = getAllButtons (getContentPane());
     for(JButton button : buttons) {
          button.setFont (new Font ( "Arial", Font.PLAIN,30));
     }
     displayText.setFont (new Font ( "Arial",Font.PLAIN,30));
}
       public List <JButton> getAllButtons (Container container){
         List<JButton> buttons = new ArrayList <>();
         Component[] componentes = container.getComponents ();
         
        for (Component componente: componentes){
        if (componente instanceof JButton){
            buttons.add((JButton) componente);
        }
      }
      return buttons;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        displayText = new javax.swing.JTextField();
        buttonAddInMemory = new javax.swing.JToggleButton();
        ButtonMemoryClear = new javax.swing.JToggleButton();
        buttonSubtractFromMemory = new javax.swing.JToggleButton();
        buttonMemoryRecall = new javax.swing.JToggleButton();
        buttonMoreless = new javax.swing.JToggleButton();
        buttonClear = new javax.swing.JToggleButton();
        buttonDivision = new javax.swing.JToggleButton();
        buttonMult = new javax.swing.JToggleButton();
        buttonSeven = new javax.swing.JToggleButton();
        buttonNine = new javax.swing.JToggleButton();
        buttonLess = new javax.swing.JToggleButton();
        buttonEight = new javax.swing.JToggleButton();
        buttonMore = new javax.swing.JToggleButton();
        buttonFour = new javax.swing.JToggleButton();
        buttonSix = new javax.swing.JToggleButton();
        buttonFive = new javax.swing.JToggleButton();
        buttonOne = new javax.swing.JToggleButton();
        buttonEquals = new javax.swing.JToggleButton();
        buttonThree = new javax.swing.JToggleButton();
        buttonTwo = new javax.swing.JToggleButton();
        buttonpoint = new javax.swing.JToggleButton();
        buttonZero = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);

        displayText.setEditable(false);
        displayText.setBackground(new java.awt.Color(204, 255, 255));
        displayText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        buttonAddInMemory.setBackground(new java.awt.Color(153, 153, 153));
        buttonAddInMemory.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonAddInMemory.setForeground(new java.awt.Color(0, 0, 0));
        buttonAddInMemory.setText("M+");
        buttonAddInMemory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddInMemoryActionPerformed(evt);
            }
        });

        ButtonMemoryClear.setBackground(new java.awt.Color(153, 153, 153));
        ButtonMemoryClear.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ButtonMemoryClear.setForeground(new java.awt.Color(0, 0, 0));
        ButtonMemoryClear.setText("MC");
        ButtonMemoryClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMemoryClearActionPerformed(evt);
            }
        });

        buttonSubtractFromMemory.setBackground(new java.awt.Color(153, 153, 153));
        buttonSubtractFromMemory.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonSubtractFromMemory.setForeground(new java.awt.Color(0, 0, 0));
        buttonSubtractFromMemory.setText("M-");
        buttonSubtractFromMemory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubtractFromMemoryActionPerformed(evt);
            }
        });

        buttonMemoryRecall.setBackground(new java.awt.Color(153, 153, 153));
        buttonMemoryRecall.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonMemoryRecall.setForeground(new java.awt.Color(0, 0, 0));
        buttonMemoryRecall.setText("MR");
        buttonMemoryRecall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMemoryRecallActionPerformed(evt);
            }
        });

        buttonMoreless.setBackground(new java.awt.Color(0, 153, 153));
        buttonMoreless.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonMoreless.setForeground(new java.awt.Color(0, 0, 0));
        buttonMoreless.setText("+/-");
        buttonMoreless.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMorelessActionPerformed(evt);
            }
        });

        buttonClear.setBackground(new java.awt.Color(0, 153, 153));
        buttonClear.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonClear.setForeground(new java.awt.Color(0, 0, 0));
        buttonClear.setText("c");
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });

        buttonDivision.setBackground(new java.awt.Color(0, 153, 153));
        buttonDivision.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonDivision.setForeground(new java.awt.Color(0, 0, 0));
        buttonDivision.setText("/");
        buttonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDivisionActionPerformed(evt);
            }
        });

        buttonMult.setBackground(new java.awt.Color(0, 153, 153));
        buttonMult.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonMult.setForeground(new java.awt.Color(0, 0, 0));
        buttonMult.setText("x");
        buttonMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMultActionPerformed(evt);
            }
        });

        buttonSeven.setBackground(new java.awt.Color(204, 204, 204));
        buttonSeven.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonSeven.setForeground(new java.awt.Color(0, 0, 0));
        buttonSeven.setText("7");
        buttonSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSevenActionPerformed(evt);
            }
        });

        buttonNine.setBackground(new java.awt.Color(204, 204, 204));
        buttonNine.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonNine.setForeground(new java.awt.Color(0, 0, 0));
        buttonNine.setText("9");
        buttonNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNineActionPerformed(evt);
            }
        });

        buttonLess.setBackground(new java.awt.Color(0, 153, 153));
        buttonLess.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonLess.setForeground(new java.awt.Color(0, 0, 0));
        buttonLess.setText("-");
        buttonLess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLessActionPerformed(evt);
            }
        });

        buttonEight.setBackground(new java.awt.Color(204, 204, 204));
        buttonEight.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonEight.setForeground(new java.awt.Color(0, 0, 0));
        buttonEight.setText("8");
        buttonEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEightActionPerformed(evt);
            }
        });

        buttonMore.setBackground(new java.awt.Color(0, 153, 153));
        buttonMore.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonMore.setForeground(new java.awt.Color(0, 0, 0));
        buttonMore.setText("+");
        buttonMore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMoreActionPerformed(evt);
            }
        });

        buttonFour.setBackground(new java.awt.Color(204, 204, 204));
        buttonFour.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonFour.setForeground(new java.awt.Color(0, 0, 0));
        buttonFour.setText("4");
        buttonFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFourActionPerformed(evt);
            }
        });

        buttonSix.setBackground(new java.awt.Color(204, 204, 204));
        buttonSix.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonSix.setForeground(new java.awt.Color(0, 0, 0));
        buttonSix.setText("6");
        buttonSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSixActionPerformed(evt);
            }
        });

        buttonFive.setBackground(new java.awt.Color(204, 204, 204));
        buttonFive.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonFive.setForeground(new java.awt.Color(0, 0, 0));
        buttonFive.setText("5");
        buttonFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFiveActionPerformed(evt);
            }
        });

        buttonOne.setBackground(new java.awt.Color(204, 204, 204));
        buttonOne.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonOne.setForeground(new java.awt.Color(0, 0, 0));
        buttonOne.setText("1");
        buttonOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOneActionPerformed(evt);
            }
        });

        buttonEquals.setBackground(new java.awt.Color(0, 153, 153));
        buttonEquals.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonEquals.setForeground(new java.awt.Color(0, 0, 0));
        buttonEquals.setText("=");
        buttonEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEqualsActionPerformed(evt);
            }
        });

        buttonThree.setBackground(new java.awt.Color(204, 204, 204));
        buttonThree.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonThree.setForeground(new java.awt.Color(0, 0, 0));
        buttonThree.setText("3");
        buttonThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonThreeActionPerformed(evt);
            }
        });

        buttonTwo.setBackground(new java.awt.Color(204, 204, 204));
        buttonTwo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonTwo.setForeground(new java.awt.Color(0, 0, 0));
        buttonTwo.setText("2");
        buttonTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTwoActionPerformed(evt);
            }
        });

        buttonpoint.setBackground(new java.awt.Color(0, 204, 204));
        buttonpoint.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonpoint.setForeground(new java.awt.Color(0, 0, 0));
        buttonpoint.setText(".");
        buttonpoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonpointActionPerformed(evt);
            }
        });

        buttonZero.setBackground(new java.awt.Color(0, 204, 204));
        buttonZero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonZero.setForeground(new java.awt.Color(0, 0, 0));
        buttonZero.setText("0");
        buttonZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonZeroActionPerformed(evt);
            }
        });

        jLabel1.setText("feito por: Mariana Vitoria Miranda Silva");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonOne, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonThree, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonZero, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonpoint, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonEquals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(displayText)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ButtonMemoryClear, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonAddInMemory, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonSubtractFromMemory, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonMemoryRecall, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonMoreless, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonMult, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonEight, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonNine, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonLess, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonFour, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonFive, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonSix, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonMore, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(47, 47, 47)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(displayText, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAddInMemory, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonMemoryClear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSubtractFromMemory, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMemoryRecall, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonMoreless, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMult, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEight, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonNine, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonLess, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonFive, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonFour, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSix, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMore, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonOne, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonThree, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonZero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonpoint, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(buttonEquals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEqualsActionPerformed
       if (operation != null){
        String resultformated;
     secondNumber = Double.parseDouble(displayText.getText());
     switch (operation){
         case "+":
             result = firstNumber + secondNumber;
             resultformated = String.format("%.2f", result);
             displayText.setText(resultformated);
             memoryReturn =result;
             break;
         case "-":
             result = firstNumber - secondNumber;
             resultformated = String.format("%.2f", result);
             displayText.setText(resultformated);
             memoryReturn =result;
             break;
         case "/":
             if(secondNumber != 0){
             result = firstNumber + secondNumber;
             resultformated = String.format("%.4f", result);
             displayText.setText(resultformated);
             memoryReturn =result;
             break;
             }
         case "*":
             result = firstNumber * secondNumber;
             resultformated = String.format("%.2f", result);
             displayText.setText(resultformated);
             memoryReturn =result;
             break;
             default:
                 throw  new AssertionError();
      }      
     } else{
           JOptionPane.showMessageDialog(this,"Operação não permitida");
       }
    }//GEN-LAST:event_buttonEqualsActionPerformed

    private void buttonThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonThreeActionPerformed
        String input;
        input = displayText.getText() + buttonThree.getText();
        displayText.setText(input);
    }//GEN-LAST:event_buttonThreeActionPerformed

    private void buttonLessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLessActionPerformed
    if(displayText.getText().equals("")){
     } else {
       firstNumber = Double.parseDouble(displayText.getText());
       displayText.setText("");
       operation = "-";
    }                  
    }//GEN-LAST:event_buttonLessActionPerformed

    private void buttonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDivisionActionPerformed
     if(displayText.getText().equals("")){
     } else {
       firstNumber = Double.parseDouble(displayText.getText());
       displayText.setText("");
       operation = "/";
    }//GEN-LAST:event_buttonDivisionActionPerformed
    }
    private void buttonZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonZeroActionPerformed
        String input;
        input = displayText.getText() + buttonZero.getText();
        displayText.setText(input);
    }//GEN-LAST:event_buttonZeroActionPerformed

    private void buttonOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOneActionPerformed
        String input;
        input = displayText.getText() + buttonOne.getText();
        displayText.setText(input);
    }//GEN-LAST:event_buttonOneActionPerformed

    private void buttonTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTwoActionPerformed
        String input;
        input = displayText.getText() + buttonTwo.getText();
        displayText.setText(input);
    }//GEN-LAST:event_buttonTwoActionPerformed

    private void buttonFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFourActionPerformed
       String input;
        input = displayText.getText() + buttonFour.getText();
        displayText.setText(input);
    }//GEN-LAST:event_buttonFourActionPerformed

    private void buttonFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFiveActionPerformed
        String input;
        input = displayText.getText() + buttonFive.getText();
        displayText.setText(input);
    }//GEN-LAST:event_buttonFiveActionPerformed

    private void buttonSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSixActionPerformed
        String input;
        input = displayText.getText() + buttonSix.getText();
        displayText.setText(input);
    }//GEN-LAST:event_buttonSixActionPerformed

    private void buttonSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSevenActionPerformed
        String input;
        input = displayText.getText() + buttonSeven.getText();
        displayText.setText(input);
    }//GEN-LAST:event_buttonSevenActionPerformed

    private void buttonEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEightActionPerformed
        String input;
        input = displayText.getText() + buttonEight.getText();
        displayText.setText(input);
    }//GEN-LAST:event_buttonEightActionPerformed

    private void buttonNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNineActionPerformed
        String input;
        input = displayText.getText() + buttonNine.getText();
        displayText.setText(input);
    }//GEN-LAST:event_buttonNineActionPerformed

    private void buttonpointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonpointActionPerformed
         String input;
        input = displayText.getText() + buttonpoint.getText();
        displayText.setText(input);
    }//GEN-LAST:event_buttonpointActionPerformed

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        displayText.setText("");
    }//GEN-LAST:event_buttonClearActionPerformed

    private void buttonMoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMoreActionPerformed
       if(displayText.getText().equals("")){
     } else {
       firstNumber = Double.parseDouble(displayText.getText());
       displayText.setText("");
       operation = "+";
    }                  
    }//GEN-LAST:event_buttonMoreActionPerformed

    private void buttonMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMultActionPerformed
     if(displayText.getText().equals("")){
     } else {
       firstNumber = Double.parseDouble(displayText.getText());
       displayText.setText("");
       operation = "*";
    }                  
    }//GEN-LAST:event_buttonMultActionPerformed

    private void buttonMorelessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMorelessActionPerformed
       double resultformated = Double.parseDouble(
       String.valueOf(displayText.getText()));
       resultformated = resultformated * (-1);
       displayText.setText(String.valueOf(resultformated));
    }//GEN-LAST:event_buttonMorelessActionPerformed

    private void buttonMemoryRecallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMemoryRecallActionPerformed
        displayText.setText("" + memoryReturn);
    }//GEN-LAST:event_buttonMemoryRecallActionPerformed

    private void buttonSubtractFromMemoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubtractFromMemoryActionPerformed
      double memoryResult;
       String resultFormated;
       double memoryMore = Double.parseDouble(displayText.getText());
       memoryResult = memoryReturn - memoryMore;
       resultFormated = String.format("%.2f", memoryResult);
       displayText.setText (resultFormated);
       memoryReturn = memoryResult;
    }//GEN-LAST:event_buttonSubtractFromMemoryActionPerformed

    private void ButtonMemoryClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMemoryClearActionPerformed
      memoryReturn = 0;
      displayText.setText("");
    }//GEN-LAST:event_ButtonMemoryClearActionPerformed

    private void buttonAddInMemoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddInMemoryActionPerformed
       double memoryResult;
       String resultFormated;
       double memoryMore = Double.parseDouble(displayText.getText());
       memoryResult = memoryReturn + memoryMore;
       resultFormated = String.format("%.2f", memoryResult);
       displayText.setText (resultFormated);
       memoryReturn = memoryResult;
       
       
       
    }//GEN-LAST:event_buttonAddInMemoryActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ScreenCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScreenCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScreenCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScreenCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScreenCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton ButtonMemoryClear;
    private javax.swing.JToggleButton buttonAddInMemory;
    private javax.swing.JToggleButton buttonClear;
    private javax.swing.JToggleButton buttonDivision;
    private javax.swing.JToggleButton buttonEight;
    private javax.swing.JToggleButton buttonEquals;
    private javax.swing.JToggleButton buttonFive;
    private javax.swing.JToggleButton buttonFour;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JToggleButton buttonLess;
    private javax.swing.JToggleButton buttonMemoryRecall;
    private javax.swing.JToggleButton buttonMore;
    private javax.swing.JToggleButton buttonMoreless;
    private javax.swing.JToggleButton buttonMult;
    private javax.swing.JToggleButton buttonNine;
    private javax.swing.JToggleButton buttonOne;
    private javax.swing.JToggleButton buttonSeven;
    private javax.swing.JToggleButton buttonSix;
    private javax.swing.JToggleButton buttonSubtractFromMemory;
    private javax.swing.JToggleButton buttonThree;
    private javax.swing.JToggleButton buttonTwo;
    private javax.swing.JToggleButton buttonZero;
    private javax.swing.JToggleButton buttonpoint;
    private javax.swing.JTextField displayText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
