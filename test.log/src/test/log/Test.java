package test.log;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.log.Logger;
import org.osgi.service.log.LoggerFactory;

@Component(immediate=true)
public class Test {

	@Reference(service = LoggerFactory.class)
	Logger logger;

	@Activate
	private void activate() {

		logger.warn("a");
	}
}
