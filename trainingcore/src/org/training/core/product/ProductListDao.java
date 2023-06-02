package org.training.core.product;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.search.SearchResult;

public interface ProductListDao {
   public SearchResult<ProductModel> findProductsByFirstLetter();
}
