package my.company;

import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.OnDomReadyHeaderItem;
import org.apache.wicket.markup.html.panel.Panel;

/**
 * Created by IntelliJ IDEA.
 * User: gruen
 * Date: 21.01.2010
 * Time: 11:13:57
 */
public class MapPanel extends Panel {

    private static final long serialVersionUID = 1L;


    public MapPanel(String id) {
        super(id);

    }


    @Override
    public void renderHead(IHeaderResponse response) {

        response.render(OnDomReadyHeaderItem.forScript("calcHeight();"));


    }


}