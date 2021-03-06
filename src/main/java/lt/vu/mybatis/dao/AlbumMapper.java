package lt.vu.mybatis.dao;

import java.util.List;
import lt.vu.mybatis.model.Album;
import org.mybatis.cdi.Mapper;

@Mapper
public interface AlbumMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.ALBUM
     *
     * @mbg.generated Tue May 12 15:59:51 EEST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.ALBUM
     *
     * @mbg.generated Tue May 12 15:59:51 EEST 2020
     */
    int insert(Album record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.ALBUM
     *
     * @mbg.generated Tue May 12 15:59:51 EEST 2020
     */
    Album selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.ALBUM
     *
     * @mbg.generated Tue May 12 15:59:51 EEST 2020
     */
    List<Album> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.ALBUM
     *
     * @mbg.generated Tue May 12 15:59:51 EEST 2020
     */
    int updateByPrimaryKey(Album record);
}