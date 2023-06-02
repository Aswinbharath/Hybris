/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 2, 2023, 7:30:18 AM                     ---
 * ----------------------------------------------------------------
 */
package org.training.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.extension.Extension;
import java.util.HashMap;
import java.util.Map;
import org.training.fulfilmentprocess.constants.TrainingFulfilmentProcessConstants;

/**
 * Generated class for type <code>TrainingFulfilmentProcessManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTrainingFulfilmentProcessManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	@Override
	public String getName()
	{
		return TrainingFulfilmentProcessConstants.EXTENSIONNAME;
	}
	
}
