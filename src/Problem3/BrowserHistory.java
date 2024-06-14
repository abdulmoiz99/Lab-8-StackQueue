package Problem3;

import java.util.Stack;

public class BrowserHistory {
    private Stack<String> back;
    private Stack<String> forward;
    private String currentUrl;

    public BrowserHistory(String currentUrl) {
        this.currentUrl = currentUrl;
        this.back = new Stack<>();
        this.forward = new Stack<>();
    }

    public void visit(String url) {
        if(currentUrl != null) {
            back.push(currentUrl);
        }

        currentUrl = url;
        forward.clear();
        System.out.println(url);
    }

    public void back() {
        if(!back.isEmpty()) {
            forward.push(currentUrl);
            currentUrl = back.pop();
            System.out.println(currentUrl);
        } else {
            System.out.println("No history");
        }
    }

    public void forward() {
        if(!forward.isEmpty()) {
            back.push(currentUrl);
            currentUrl = forward.pop();
            System.out.println(currentUrl);
        } else {
            System.out.println("No foward history");
        }
    }

    public String getCurrentUrl() {
        return currentUrl;
    }
}
