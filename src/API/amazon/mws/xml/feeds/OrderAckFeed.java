package API.amazon.mws.xml.feeds;

import API.amazon.mws.xml.JAXB.AmazonEnvelope.Message;

public class OrderAckFeed extends XMLFeed{
	
	public static final String FEED_TYPE = "_POST_ORDER_ACKNOWLEDGEMENT_DATA_";

	@Override
	public String getFeedType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getEnvelopeMessageType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message createMessage(Object dataObject, boolean isBasic) {
		// TODO Auto-generated method stub
		return null;
	}
}
