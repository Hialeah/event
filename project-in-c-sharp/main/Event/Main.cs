using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace App2
{
    public partial class Main : MetroFramework.Forms.MetroForm
    {
        public Main()
        {
            InitializeComponent();

        }

        private void Main_Load(object sender, EventArgs e)
        {
            

        }

        private void metroButton1_Click(object sender, EventArgs e)
        {
            // Panel show/hide
            Student_panel.Show();
           
            WelcomePanel.Hide();
           
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void metroTextBox3_Click(object sender, EventArgs e)
        {

        }

        private void Student_panel_Paint(object sender, PaintEventArgs e)
        {
           
        } 

        private void metroButton2_Click(object sender, EventArgs e)
        {
            // Hides all Panels show only the selected one
          
            Student_panel.Hide();
            
            WelcomePanel.Hide();
            

           


        }

        private void Hotel_panel_Paint(object sender, PaintEventArgs e)
        {

        }

        private void About_Click_1(object sender, EventArgs e)
        {
            // Aabout Form
            About access = new About();
            this.Hide();
            access.Show();
            

        }

        private void panel3_Paint(object sender, PaintEventArgs e)
        {

        }

        private void metroButton3_Click(object sender, EventArgs e)
        {
            // Panel Show/Hide  
            Student_panel.Hide();
            WelcomePanel.Hide();
            
        }

        private void Main_FormClosing(object sender, FormClosingEventArgs e)
        {
            
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {
          
        }

        private void progressBar1_Click(object sender, EventArgs e)
        {
            
        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {
            
        }

        private void textBox3_TextChanged(object sender, EventArgs e)
        {
           
        }

        private void textBox4_TextChanged(object sender, EventArgs e)
        {
            
        }

        private void textBox8_TextChanged(object sender, EventArgs e)
        {
            
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            
        }

        private void textBox6_TextChanged(object sender, EventArgs e)
        {
            
        }

        private void textBox5_TextChanged(object sender, EventArgs e)
        {
           
        }

        private void textBox7_TextChanged(object sender, EventArgs e)
        {
            
            
        }

        private void metroProgressBar1_Click(object sender, EventArgs e)
        {
            
        }

        private void metroLabel1_Click(object sender, EventArgs e)
        {
           
        }

        private void pictureBox2_Click(object sender, EventArgs e)
        {

        }

        private void WelcomePanel_Paint(object sender, PaintEventArgs e)
        {

        }

        private void pictureBox3_Click(object sender, EventArgs e)
        {
            // Panel Show/Hide
            WelcomePanel.Show();
            Student_panel.Hide();
            
            

        }

        private void progressBar_Click(object sender, EventArgs e)
        {

        }

        private void Travel_panel_Paint(object sender, PaintEventArgs e)
        {

        }

        private void metroButton4_Click(object sender, EventArgs e)
        {
            
            WelcomePanel.Hide();
            Student_panel.Hide();
            
        }

        private void metroLabel2_Click(object sender, EventArgs e)
        {

        }

        private void label24_Click(object sender, EventArgs e)
        {

        }

        private void textBox17_TextChanged(object sender, EventArgs e)
        {

        }

        private void label25_Click(object sender, EventArgs e)
        {

        }

        private void textBox18_TextChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            this.Hide();
            Expenses access = new Expenses();
            access.Show();
        }

        private void textBox20_TextChanged(object sender, EventArgs e)
        {

        }

        private void richTextBox1_TextChanged(object sender, EventArgs e)
        {
            

        }

        private void label32_Click(object sender, EventArgs e)
        {

        }

        private void textBox22_TextChanged(object sender, EventArgs e)
        {

        }

        private void label40_Click(object sender, EventArgs e)
        {

        }

        private void label35_Click(object sender, EventArgs e)
        {

        }

        private void textBox26_TextChanged(object sender, EventArgs e)
        {

        }

        private void label36_Click(object sender, EventArgs e)
        {

        }

        private void textBox27_TextChanged(object sender, EventArgs e)
        {

        }

        private void label37_Click(object sender, EventArgs e)
        {

        }

        private void textBox28_TextChanged(object sender, EventArgs e)
        {

        }

        private void label38_Click(object sender, EventArgs e)
        {

        }

        private void textBox29_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox30_TextChanged(object sender, EventArgs e)
        {

        }

        private void label39_Click(object sender, EventArgs e)
        {

        }

        private void textBox25_TextChanged(object sender, EventArgs e)
        {

        }

        private void radioButton2_CheckedChanged(object sender, EventArgs e)
        {
           
        }

        private void radioButton1_CheckedChanged(object sender, EventArgs e)
        {
            if (radioButton1.Checked)
            {
                StudentID_box.Show();
                label5.Show();
            }
            }

        private void label21_Click(object sender, EventArgs e)
        {

        }

        private void metroButton5_Click(object sender, EventArgs e)
        {

        }

        private void button3_Click(object sender, EventArgs e)
        {
            Expenses access = new Expenses();
            this.Hide();
            access.Show();

        }

        private void textBox19_TextChanged(object sender, EventArgs e)
        {

        }

        private void label52_Click(object sender, EventArgs e)
        {

        }
    }
}
