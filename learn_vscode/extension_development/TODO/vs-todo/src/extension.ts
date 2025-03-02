import * as vscode from 'vscode';

export function activate(context: vscode.ExtensionContext) {

	console.log('Congratulations, your extension "vs-todo" is now active!');

	const disposable = vscode.commands.registerCommand('vs-todo.helloWorld', () => {
		vscode.window.showInformationMessage('Hello World from VS_TODO!');
	});

	context.subscriptions.push(disposable);
}

export function deactivate() {}
