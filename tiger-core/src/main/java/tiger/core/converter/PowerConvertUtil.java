/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.core.converter;

import tiger.common.data.dataobject.BaseDO;
import tiger.common.data.dataobject.PowerGdpCorrelationEnterpriseSoloDO;
import tiger.common.data.dataobject.PowerGdpCorrelationIndustryDO;
import tiger.core.base.PowerGdpCorrelationBaseDomain;
import tiger.core.domain.PowerGdpCorrelationEnterpriseSoloDomain;
import tiger.core.domain.PowerGdpCorrelationIndustrySoloDomain;

/**
 * Created by Bongo on 16/3/9.
 */
public class PowerConvertUtil {
    private PowerConvertUtil(){}

    /**
     * @return PowerGdpCorrelationIndustrySoloDomain 如果是真实值则调用
     * @param _DO
     * */
    public static PowerGdpCorrelationBaseDomain singleConvertOnReal(BaseDO _DO){

        if (_DO instanceof PowerGdpCorrelationEnterpriseSoloDO){
            PowerGdpCorrelationEnterpriseSoloDomain domain = new PowerGdpCorrelationEnterpriseSoloDomain();
            PowerGdpCorrelationEnterpriseSoloDO DO = (PowerGdpCorrelationEnterpriseSoloDO)_DO;
            DO = (PowerGdpCorrelationEnterpriseSoloDO)_DO;
            domain.setEnterpriseId(DO.getEnterpriseId());
            domain.setYear(DO.getYear());
            domain.setSeason(DO.getSeason());
            domain.setGdpValue(DO.getRealEnterpriseGdp());
            domain.setPowerValue(DO.getRealEnterprisePower());
            return domain;
        }
        if(_DO instanceof PowerGdpCorrelationIndustryDO){
            PowerGdpCorrelationIndustrySoloDomain domain = new PowerGdpCorrelationIndustrySoloDomain();
            PowerGdpCorrelationIndustryDO DO = (PowerGdpCorrelationIndustryDO)_DO;
            DO = (PowerGdpCorrelationIndustryDO)_DO;
            domain.setIndustryId(DO.getIndustryId());
            domain.setYear(DO.getYear());
            domain.setSeason(DO.getSeason());
            domain.setGdpValue(DO.getRealIndustryGdp());
            domain.setPowerValue(DO.getRealIndustryPower());
            return domain;
        }
        return null;
    }

    /**
     * @return PowerGdpCorrelationIndustrySoloDomain 如果是预测值则调用
     * @param _DO
     * */
    public static PowerGdpCorrelationBaseDomain singleConvertOnForcast(BaseDO _DO){

        if (_DO instanceof PowerGdpCorrelationEnterpriseSoloDO){
            PowerGdpCorrelationEnterpriseSoloDomain domain = new PowerGdpCorrelationEnterpriseSoloDomain();
            PowerGdpCorrelationEnterpriseSoloDO DO = (PowerGdpCorrelationEnterpriseSoloDO)_DO;
            DO = (PowerGdpCorrelationEnterpriseSoloDO)_DO;
            domain.setEnterpriseId(DO.getEnterpriseId());
            domain.setYear(DO.getYear());
            domain.setSeason(DO.getSeason());
            domain.setGdpValue(DO.getForcastEnterpriseGdp());
            domain.setPowerValue(DO.getForcastEnterprisePower());
            return domain;
        }
        if(_DO instanceof PowerGdpCorrelationIndustryDO){
            PowerGdpCorrelationIndustrySoloDomain domain = new PowerGdpCorrelationIndustrySoloDomain();
            PowerGdpCorrelationIndustryDO DO = (PowerGdpCorrelationIndustryDO)_DO;
            DO = (PowerGdpCorrelationIndustryDO)_DO;
            domain.setIndustryId(DO.getIndustryId());
            domain.setYear(DO.getYear());
            domain.setSeason(DO.getSeason());
            domain.setGdpValue(DO.getForcastIndustryGdp());
            domain.setPowerValue(DO.getForcastIndustryPower());
            return domain;
        }
        return null;
    }

}
