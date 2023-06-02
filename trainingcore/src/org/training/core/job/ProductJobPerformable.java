package org.training.core.job;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.training.core.product.ProductListDao;


public class ProductJobPerformable extends AbstractJobPerformable<CronJobModel> {

   private static final Logger LOG = Logger.getLogger(ProductJobPerformable.class);

   @Autowired
    ProductListDao productListDao;

    @Override
    public PerformResult perform(CronJobModel cronJobModel) {
        SearchResult<ProductModel> list = productListDao.findProductsByFirstLetter();

        LOG.info("::Products will print start with 1");
        list.getResult().stream().forEach(this::printProductCodes);
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }

    protected void printProductCodes(ProductModel productModel){
        LOG.info(productModel.getCode()+ " "+productModel.getName());
    }
}
