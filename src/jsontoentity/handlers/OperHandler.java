package jsontoentity.handlers;

import javax.swing.JFrame;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import jsontoentity.frames.JsonToEntityV2;
/**
 * 执行命令
 * @author zjp
 * @date 2017年3月10日
 */
public class OperHandler extends AbstractHandler {
	private static JFrame frame;
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		 IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		if(frame==null)
		{
			frame= new JsonToEntityV2("Json To Entity Tools");
		}
		frame.setVisible(true);
		// MessageDialog.openInformation(window.getShell(), "信息提示", "msg");
		return null;
	}
}