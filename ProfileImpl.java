
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

public class ProfileImpl implements ProfileServices {

    @Override
    public Profil insert(Profil profil) throws SQLException {
        PreparedStatement st = KoneksiDb.getConnection().prepareStatement("insert into anggota values(?,?,?,?)");
        st.setInt(1, profil.getId());
        st.setString(2, profil.getNama());
        st.setString(3, profil.getAlamat());
        st.setString(4, profil.getTelp());
        st.executeUpdate();



        return profil;
    }

    @Override
    public void update(Profil profil) throws SQLException {
        PreparedStatement st = KoneksiDb.getConnection().prepareStatement("update anggota set nama=?,alamat=?,telp=? where id=?");

        st.setString(1, profil.getNama());
        st.setString(2, profil.getAlamat());
        st.setString(3, profil.getTelp());
        st.setInt(4, profil.getId());
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
            p.setId(rs.getInt("id"));
            p.setNama(rs.getString("nama"));
            p.setAlamat(rs.getString("alamat"));
            p.setTelp(rs.getString("telp"));
            list.add(p);
        }
        return list;
    }
}
