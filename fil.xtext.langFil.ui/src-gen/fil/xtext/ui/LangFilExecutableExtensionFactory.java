/*
 * generated by Xtext 2.25.0
 */
package fil.xtext.ui;

import com.google.inject.Injector;
import fil.xtext.langFil.ui.internal.LangFilActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class LangFilExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(LangFilActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		LangFilActivator activator = LangFilActivator.getInstance();
		return activator != null ? activator.getInjector(LangFilActivator.FIL_XTEXT_LANGFIL) : null;
	}

}
