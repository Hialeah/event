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
    public partial class Expenses : MetroFramework.Forms.MetroForm
    {



        public Expenses()
        {
            // Contstructor
            InitializeComponent();



            // Code
            bool saved = false;
        }            

        private void Expenses_Load(object sender, EventArgs e)
        {

        }

        private void label19_Click(object sender, EventArgs e)
        {

        }

        private void textBox33_TextChanged(object sender, EventArgs e)
        {

        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {
            bool saved = false;
            MessageBox.Show("Hands Up! Save your Work");

            this.Hide();
            Main access = new Main();
            access.Show();

            
          

            
        }

        private void textBox23_TextChanged(object sender, EventArgs e)
        {


        }

        private void textBox7_TextChanged(object sender, EventArgs e)
        {

        }


        private void Save_button_Click(object sender, EventArgs e)
        {
           
        }
    }
}
