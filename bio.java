Skip to content
Search or jump to…

Pull requests
Issues
Marketplace
Explore
 
@alfiahrusli 
 The password you provided is weak and can be easily guessed. To increase your security, you must update your password. After July 28, 2020 we will automatically reset your password. Change your password on the settings page.

Read our documentation on safer password practices.

Learn Git and GitHub without any code!
Using the Hello World guide, you’ll start a branch, write comments, and open a pullalfiahrusli
/
UAS_PBO
1
00
Code
Issues
Pull requests
Actions
Projects
Wiki
Security
Insights
Add files via upload

 master
@alfiahrusli
alfiahrusli committed yesterday 
0 parents commit c19063ce8b2c24420eb8a17c3ab20c3b39c64831
Showing  with 885 additions and 0 deletions.
 50  Bio.java 
@@ -0,0 +1,50 @@
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author m4rh3
 */
public class Bio {

    int nim;
    String nama;
    String alamat;
    String umur;

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

} 
 301  ProfilGUI.form 
@@ -0,0 +1,301 @@
<?xml version="1.0" encoding="UTF-8" ?>

<Form version="1.3" maxVersion="1.9" type="org.netbeans.modules.form.forminfo.JFrameFormInfo">
  <Properties>
    <Property name="defaultCloseOperation" type="int" value="3"/>
    <Property name="background" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
      <Color blue="cc" green="ff" red="ff" type="rgb"/>
    </Property>
  </Properties>
  <SyntheticProperties>
    <SyntheticProperty name="formSizePolicy" type="int" value="1"/>
    <SyntheticProperty name="generateCenter" type="boolean" value="true"/>
  </SyntheticProperties>
  <AuxValues>
    <AuxValue name="FormSettings_autoResourcing" type="java.lang.Integer" value="0"/>
    <AuxValue name="FormSettings_autoSetComponentName" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_generateFQN" type="java.lang.Boolean" value="true"/>
    <AuxValue name="FormSettings_generateMnemonicsCode" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_i18nAutoMode" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_layoutCodeTarget" type="java.lang.Integer" value="1"/>
    <AuxValue name="FormSettings_listenerGenerationStyle" type="java.lang.Integer" value="0"/>
    <AuxValue name="FormSettings_variablesLocal" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_variablesModifier" type="java.lang.Integer" value="2"/>
  </AuxValues>

  <Layout>
    <DimensionLayout dim="0">
      <Group type="103" groupAlignment="0" attributes="0">
          <Group type="102" attributes="0">
              <Group type="103" groupAlignment="0" attributes="0">
                  <Group type="102" attributes="0">
                      <EmptySpace min="-2" pref="32" max="-2" attributes="0"/>
                      <Group type="103" groupAlignment="0" attributes="0">
                          <Component id="jLabel3" alignment="0" min="-2" max="-2" attributes="0"/>
                          <Component id="jLabel2" alignment="0" min="-2" max="-2" attributes="0"/>
                          <Component id="jLabel4" alignment="0" min="-2" max="-2" attributes="0"/>
                          <Component id="jLabel5" min="-2" max="-2" attributes="0"/>
                      </Group>
                      <EmptySpace min="-2" pref="28" max="-2" attributes="0"/>
                      <Group type="103" groupAlignment="0" attributes="0">
                          <Component id="jPanel1" min="-2" max="-2" attributes="0"/>
                          <Group type="103" groupAlignment="0" max="-2" attributes="0">
                              <Component id="jScrollPane3" pref="384" max="32767" attributes="0"/>
                              <Group type="102" alignment="0" attributes="0">
                                  <Component id="Add" min="-2" pref="93" max="-2" attributes="0"/>
                                  <EmptySpace type="unrelated" max="-2" attributes="0"/>
                                  <Component id="Refresh" min="-2" pref="90" max="-2" attributes="0"/>
                              </Group>
                              <Component id="txtNama" alignment="0" max="32767" attributes="0"/>
                              <Component id="jScrollPane2" alignment="0" max="32767" attributes="0"/>
                              <Component id="txtId" alignment="0" max="32767" attributes="0"/>
                              <Component id="txtTelp" alignment="0" max="32767" attributes="0"/>
                          </Group>
                      </Group>
                  </Group>
                  <Group type="102" alignment="0" attributes="0">
                      <EmptySpace min="-2" pref="248" max="-2" attributes="0"/>
                      <Component id="jLabel1" min="-2" max="-2" attributes="0"/>
                  </Group>
              </Group>
              <EmptySpace pref="84" max="32767" attributes="0"/>
          </Group>
      </Group>
    </DimensionLayout>
    <DimensionLayout dim="1">
      <Group type="103" groupAlignment="0" attributes="0">
          <Group type="102" attributes="0">
              <EmptySpace min="-2" pref="28" max="-2" attributes="0"/>
              <Component id="jLabel1" min="-2" max="-2" attributes="0"/>
              <EmptySpace type="separate" max="-2" attributes="0"/>
              <Group type="103" groupAlignment="3" attributes="0">
                  <Component id="jLabel2" alignment="3" min="-2" max="-2" attributes="0"/>
                  <Component id="txtId" alignment="3" min="-2" max="-2" attributes="0"/>
              </Group>
              <EmptySpace type="unrelated" max="-2" attributes="0"/>
              <Group type="103" groupAlignment="3" attributes="0">
                  <Component id="txtNama" alignment="3" min="-2" max="-2" attributes="0"/>
                  <Component id="jLabel3" alignment="3" min="-2" max="-2" attributes="0"/>
              </Group>
              <EmptySpace type="separate" max="-2" attributes="0"/>
              <Group type="103" groupAlignment="1" attributes="0">
                  <Component id="jLabel4" alignment="0" min="-2" max="-2" attributes="0"/>
                  <Group type="102" alignment="0" attributes="0">
                      <Component id="jScrollPane2" min="-2" pref="74" max="-2" attributes="0"/>
                      <EmptySpace type="separate" max="-2" attributes="0"/>
                      <Group type="103" groupAlignment="3" attributes="0">
                          <Component id="txtTelp" alignment="3" min="-2" max="-2" attributes="0"/>
                          <Component id="jLabel5" alignment="3" min="-2" max="-2" attributes="0"/>
                      </Group>
                      <EmptySpace type="unrelated" max="-2" attributes="0"/>
                      <Group type="103" groupAlignment="3" attributes="0">
                          <Component id="Add" alignment="3" min="-2" pref="45" max="-2" attributes="0"/>
                          <Component id="Refresh" alignment="3" min="-2" pref="45" max="-2" attributes="0"/>
                      </Group>
                      <EmptySpace type="separate" max="-2" attributes="0"/>
                      <Component id="jScrollPane3" min="-2" pref="116" max="-2" attributes="0"/>
                  </Group>
              </Group>
              <EmptySpace max="-2" attributes="0"/>
              <Component id="jPanel1" min="-2" max="-2" attributes="0"/>
              <EmptySpace max="32767" attributes="0"/>
          </Group>
      </Group>
    </DimensionLayout>
  </Layout>
  <SubComponents>
    <Component class="javax.swing.JLabel" name="jLabel2">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Tahoma" size="14" style="0"/>
        </Property>
        <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
          <Color red="ff" grey="33" lavender="33" type="rgb"/>
        </Property>
        <Property name="text" type="java.lang.String" value="ID"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JLabel" name="jLabel3">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Tahoma" size="14" style="0"/>
        </Property>
        <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
          <Color red="ff" grey="33" lavender="33" type="rgb"/>
        </Property>
        <Property name="text" type="java.lang.String" value="NAMA"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JLabel" name="jLabel4">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Tahoma" size="14" style="0"/>
        </Property>
        <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
          <Color red="ff" grey="33" lavender="33" type="rgb"/>
        </Property>
        <Property name="text" type="java.lang.String" value="ALAMAT"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JLabel" name="jLabel5">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Tahoma" size="14" style="0"/>
        </Property>
        <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
          <Color red="ff" grey="33" lavender="33" type="rgb"/>
        </Property>
        <Property name="text" type="java.lang.String" value="TELEPON"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JTextField" name="txtId">
      <Properties>
        <Property name="editable" type="boolean" value="false"/>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Tahoma" size="14" style="0"/>
        </Property>
        <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
          <Color red="ff" grey="66" lavender="33" type="rgb"/>
        </Property>
        <Property name="name" type="java.lang.String" value="" noResource="true"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JTextField" name="txtNama">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Tahoma" size="14" style="0"/>
        </Property>
        <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
          <Color red="ff" grey="66" lavender="33" type="rgb"/>
        </Property>
      </Properties>
      <Events>
        <EventHandler event="mouseClicked" listener="java.awt.event.MouseListener" parameters="java.awt.event.MouseEvent" handler="txtNamaMouseClicked"/>
      </Events>
    </Component>
    <Component class="javax.swing.JTextField" name="txtTelp">
      <Properties>
        <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
          <Color red="ff" grey="66" lavender="33" type="rgb"/>
        </Property>
      </Properties>
    </Component>
    <Component class="javax.swing.JLabel" name="jLabel1">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Tahoma" size="14" style="1"/>
        </Property>
        <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
          <Color red="ff" grey="66" lavender="33" type="rgb"/>
        </Property>
        <Property name="text" type="java.lang.String" value="BIODATA"/>
      </Properties>
    </Component>
    <Container class="javax.swing.JPanel" name="jPanel1">

      <Layout>
        <DimensionLayout dim="0">
          <Group type="103" groupAlignment="0" attributes="0">
              <Group type="102" alignment="0" attributes="0">
                  <Component id="Edit" min="-2" pref="90" max="-2" attributes="0"/>
                  <EmptySpace type="unrelated" max="-2" attributes="0"/>
                  <Component id="Delete" min="-2" pref="92" max="-2" attributes="0"/>
                  <EmptySpace pref="42" max="32767" attributes="0"/>
              </Group>
          </Group>
        </DimensionLayout>
        <DimensionLayout dim="1">
          <Group type="103" groupAlignment="0" attributes="0">
              <Group type="102" alignment="0" attributes="0">
                  <EmptySpace max="-2" attributes="0"/>
                  <Group type="103" groupAlignment="3" attributes="0">
                      <Component id="Edit" alignment="3" min="-2" pref="43" max="-2" attributes="0"/>
                      <Component id="Delete" alignment="3" min="-2" pref="42" max="-2" attributes="0"/>
                  </Group>
                  <EmptySpace max="32767" attributes="0"/>
              </Group>
          </Group>
        </DimensionLayout>
      </Layout>
      <SubComponents>
        <Component class="javax.swing.JButton" name="Delete">
          <Properties>
            <Property name="text" type="java.lang.String" value="Delete"/>
          </Properties>
          <Events>
            <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="DeleteActionPerformed"/>
          </Events>
        </Component>
        <Component class="javax.swing.JButton" name="Edit">
          <Properties>
            <Property name="text" type="java.lang.String" value="Edit"/>
          </Properties>
          <Events>
            <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="EditActionPerformed"/>
          </Events>
        </Component>
      </SubComponents>
    </Container>
    <Component class="javax.swing.JButton" name="Add">
      <Properties>
        <Property name="text" type="java.lang.String" value="Add"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="AddActionPerformed"/>
      </Events>
    </Component>
    <Component class="javax.swing.JButton" name="Refresh">
      <Properties>
        <Property name="text" type="java.lang.String" value="Refresh"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="RefreshActionPerformed"/>
      </Events>
    </Component>
    <Container class="javax.swing.JScrollPane" name="jScrollPane2">
      <AuxValues>
        <AuxValue name="autoScrollPane" type="java.lang.Boolean" value="true"/>
      </AuxValues>

      <Layout class="org.netbeans.modules.form.compat2.layouts.support.JScrollPaneSupportLayout"/>
      <SubComponents>
        <Component class="javax.swing.JTextArea" name="txtAlamat">
          <Properties>
            <Property name="columns" type="int" value="20"/>
            <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
              <Font name="Tahoma" size="14" style="0"/>
            </Property>
            <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
              <Color red="ff" grey="66" lavender="33" type="rgb"/>
            </Property>
            <Property name="rows" type="int" value="5"/>
          </Properties>
        </Component>
      </SubComponents>
    </Container>
    <Container class="javax.swing.JScrollPane" name="jScrollPane3">
      <AuxValues>
        <AuxValue name="autoScrollPane" type="java.lang.Boolean" value="true"/>
      </AuxValues>

      <Layout class="org.netbeans.modules.form.compat2.layouts.support.JScrollPaneSupportLayout"/>
      <SubComponents>
        <Component class="javax.swing.JTable" name="jTable1">
          <Properties>
            <Property name="model" type="javax.swing.table.TableModel" editor="org.netbeans.modules.form.editors2.TableModelEditor">
              <Table columnCount="4" rowCount="4">
                <Column editable="true" title="Title 1" type="java.lang.Object"/>
                <Column editable="true" title="Title 2" type="java.lang.Object"/>
                <Column editable="true" title="Title 3" type="java.lang.Object"/>
                <Column editable="true" title="Title 4" type="java.lang.Object"/>
              </Table>
            </Property>
          </Properties>
          <Events>
            <EventHandler event="mouseClicked" listener="java.awt.event.MouseListener" parameters="java.awt.event.MouseEvent" handler="jTable1MouseClicked"/>
          </Events>
        </Component>
      </SubComponents>
    </Container>
  </SubComponents>
</Form> 
 63  ProfileImplDew.java 
@@ -0,0 +1,63 @@
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author m4rh3
 */
import java.sql.*;
import java.util.*;

public class ProfileImplDew implements ProfileServices {

    @Override
    public Profil insert(Profil profil) throws SQLException {
        PreparedStatement st = KoneksiDb.getConnection().prepareStatement("insert into anggota values(?,?,?,?)");
        st.setInt(1, profil.getNim());
        st.setString(2, profil.getNama());
        st.setString(3, profil.getAlamat());
        st.setString(4, profil.getUmur());
        st.executeUpdate();



        return profil;
    }

    @Override
    public void update(Profil profil) throws SQLException {
        PreparedStatement st = KoneksiDb.getConnection().prepareStatement("update anggota set nama=?,alamat=?,telp=? where id=?");

        st.setString(1, profil.getNama());
        st.setString(2, profil.getAlamat());
        st.setString(3, profil.getUmur());
        st.setInt(4, profil.getNim());
        st.executeUpdate();

    }

    @Override
    public void delete(int id) throws SQLException {
        PreparedStatement st = KoneksiDb.getConnection().prepareStatement("delete from anggota  where id=?");
        st.setInt(1, id);
        st.executeUpdate();
    }

    @Override
    public List getAll() throws SQLException {
        Statement st = KoneksiDb.getConnection().createStatement();
        ResultSet rs = st.executeQuery("select * from anggota");
        List list = new ArrayList();
        while (rs.next()) {
            Profil p = new Profil();
            p.setNim(rs.getInt("nim"));
            p.setNama(rs.getString("nama"));
            p.setAlamat(rs.getString("alamat"));
            p.setUmur(rs.getString("umur"));
            list.add(p);
        }
        return list;
    }
} 
 19  ProfileServices.java 
@@ -0,0 +1,19 @@
import java.sql.SQLException;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author m4rh3
 */
public interface ProfileServices {
    Profil insert(Profil profil) throws SQLException;
    void update(Profil profil) throws SQLException;
    void delete(int id) throws SQLException;
    List getAll() throws SQLException;
} 
 420  Profilgui.java 
Large diffs are not rendered by default.

 BIN +1.7 KB UAS NO.2 DAN 3.rtf 
Binary file not shown.
 32  koneksidb.java 
@@ -0,0 +1,32 @@
import java.sql.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author m4rh3
 */
public class koneksidb {
    static Connection koneksi = null;

    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/db_profil";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Terkoneksi");
            } catch (SQLException t) {
                System.out.println("Error membuat koneksi");
            }
        }
        return koneksi;
    }
} 
0 comments on commit c19063c
@alfiahrusli
 
 
Leave a comment

Attach files by dragging & dropping, selecting or pasting them.
 You’re not receiving notifications from this thread.
© 2020 GitHub, Inc.
Terms
Privacy
Security
Status
Help
Contact GitHub
Pricing
API
Training
Blog
About
