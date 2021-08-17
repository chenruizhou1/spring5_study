package service;

import model.Equipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @author chenruizhou
 * @date 2021/8/17
 * 实现JdbcTemplate测试Service
 */
@Service
public class EquipmentService {

    private final JdbcTemplate jdbcTemplate;
    @Autowired
    public EquipmentService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void addEquipment(Equipment equipment) {
        String sql = "INSERT INTO t_equipment (`ID`,`NAME`,`TYPE`,`LEVEL`) VALUES (?,?,?,?)";
        Object[] args = {equipment.getId(), equipment.getName(), equipment.getType(), equipment.getLevel()};
        jdbcTemplate.update(sql, args);
    }

}
