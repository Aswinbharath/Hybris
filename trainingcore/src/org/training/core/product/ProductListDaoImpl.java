package org.training.core.product;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.product.daos.impl.DefaultProductDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

public class ProductListDaoImpl extends DefaultProductDao implements ProductListDao {

    public ProductListDaoImpl(String typecode){
        super(typecode);
    }
    @Override
    public SearchResult<ProductModel> findProductsByFirstLetter() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SELECT {p:").append(ProductModel.PK).append("} ");
        stringBuilder.append("FROM {").append(ProductModel._TYPECODE).append(" AS p ").append("} ");
        stringBuilder.append("WHERE ").append("{p.code} like '1%'");

        FlexibleSearchQuery  searchQuery = new FlexibleSearchQuery(stringBuilder.toString());
        return getFlexibleSearchService().search(searchQuery);
    }
}
