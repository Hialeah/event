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
    public partial class About : MetroFramework.Forms.MetroForm
    {
        public About()
        {
            InitializeComponent();
        }

        private void About_Load(object sender, EventArgs e)
        {

        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {
           
            Main access = new Main();
            access.Show();

        }

        private void About_FormClosing(object sender, FormClosingEventArgs e)
        {
            

        }
    }
}
